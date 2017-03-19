App = {
	persons: null,
	sortColumn: null,
	sortOrder: null ,
	
	init: function () {
		$("btnSubmit").addEventListener("click", App.search);
		
		$("btnClear").addEventListener("click", App.clearCriteria);
		
	},
	
	search: function () {
		App.searchPersons() ;
		App.refreshGrid();
	},
	
	refreshGrid: function() {
		PersonGrid.init();
		
		PersonGrid.clear();
		PersonGrid.render(App.persons);
		PersonGrid.showSortColumn(App.sortColumn, App.sortOrder);
		
		$("tblContent").style.display = "" ;
		$("personDetails").style.display = "none" ;
	},
	
	sort: function(colId) {
		if(App.sortColumn == colId) {
			if(App.sortOrder) {
				App.sortOrder = (App.sortOrder == 1) ? -1: 1;
			} else {
				App.sortOrder = 1 ;
			}
		} else {
			App.sortOrder = 1 ;
		}
		
		App.sortColumn = colId ;
		
		App.persons.sort(function(p1, p2) {
			if(colId == "name") {
				// the App.sortOrder value is +1 for ASC, and -1 for DESC, so simply multiply by this factor to apply the ordering
				if(p1.name > p2.name) {
					return 1 * App.sortOrder ;
				} else if(p1.name < p2.name) {
					return -1 * App.sortOrder;
				} else {
					return 0;
				}
			} else if(colId == "age") {
				if(p1.age > p2.age) {
					return 1 * App.sortOrder;
				} else if(p1.age < p2.age) {
					return -1 * App.sortOrder;
				} else {
					return 0;
				}
			}
		}) ;
		
		App.refreshGrid();
		
	},
	
	showPerson: function(id, rowIdx) {
		var person = null ;
		
		if(App.persons) {
			
			//use Array class's find()
			person = App.persons.find(function(data) {
				return (data.id == id ) ;
			}) ;
			
			/*
			//Approach 2:
			for(var i = 0; i < App.persons.length; i++) {
				if(App.persons[i].id == id) {
					return App.persons[i] ;
				}
			}
			
			return null;
			*/
		}
		
		if(person) {
			$("pId").innerHTML = person.id ;
			$("pName").innerHTML = person.name ;
			$("pAge").innerHTML = person.age ;
			$("pPlace").innerHTML = person.place ;
			
			//show the details panel
			$("personDetails").style.display = "" ;
		}
		
		PersonGrid.highlightRow(rowIdx) ;
	},
	
	
	searchPersons: function() {
		if(App.persons) {
			return ;
		}
		
		App.persons = [
		    	{id: 1, name: "Billy Graham", age: 55, place: "Charlotte"},
		    	{id: 2, name: "John Song", age: 35, place: "New York"},
		    	{id: 3, name: "Mark Brown", age: 37, place: "New York"},
		    	{id: 4, name: "Brenton", age: 52, place: "Cincinnati"},
		    	{id: 5, name: "Jacky", age: 45, place: "Minnesota"},
		    	{id: 6, name: "Jill", age: 89, place: "Raleigh"}
		    ] ;
	},

	clearCriteria: function () {
		$("searchKeyword").value = "";
		$("searchArchive").value = "N" ;
		
		PersonGrid.clear();
		$("tblContent").style.display = "none" ;
		$("personDetails").style.display = "none" ;
	}
} ;


function $(id) {
	return document.getElementById(id) ;
}
