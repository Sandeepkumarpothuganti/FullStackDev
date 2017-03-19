
PersonGrid = {
	currentRow: -1,
	
	init: function() {
		//create column headers
		var grid = $("tblContent") ;
		
		if(grid.tHead) {
			return ;
		}
		
		var thead = grid.createTHead()  ;
		
		var row = thead.insertRow(-1) ;
		
		var cell = document.createElement("TH");
		cell.innerHTML = "Person ID" ;
		row.appendChild(cell) ;
		
		cell = document.createElement("TH");
		cell.innerHTML = "Name" ;
		cell.setAttribute("col_id", "name");
		cell.className = "Sortable" ;
		cell.addEventListener("click", App.sort.bind(this, "name")) ;
		row.appendChild(cell) ;
		
		cell = document.createElement("TH");
		cell.innerHTML = "Age" ;
		cell.setAttribute("col_id", "age");
		cell.className = "Sortable" ;
		cell.addEventListener("click", App.sort.bind(this, "age")) ;
		row.appendChild(cell) ;
		
		cell = document.createElement("TH");
		cell.innerHTML = "Place" ;
		row.appendChild(cell) ;
		
		thead.appendChild(row);
	},
	
	clear: function() {
		var grid = $("tblContent") ;

		var tbody = null ;
		if(grid.tBodies && grid.tBodies.length > 0) {
			tbody = grid.tBodies[0] ;
		} else {
			return ;
		} 
		
		//remove all the current data
		if(false) {
			//approach 1
			var rows = tbody.childNodes;
			for(var r=rows.length-1; r >= 0 ; r--) {
				tbody.removeChild(rows[r]) ;
			}
		} else {
			//approach 2
			while(tbody.hasChildNodes()){
				tbody.removeChild(tbody.firstChild);
			}
		}
	},
	
	showSortColumn: function(sortColumn, sortOrder) {
		if(!sortColumn) {
			return ;
		}
			
		//now change the column header's sort icon
		var hrow = $("tblContent").tHead.rows[0] ;
		var cells = hrow.childNodes ;
		
		//first clear out the old sorting icon
		for(var c= 0; c < cells.length ; c++) {
			//replace both (asc/desc) sort classNames for each cell
			cells[c].className = cells[c].className.replace(/ SortAsc /, "");
			cells[c].className = cells[c].className.replace(/ SortDesc /, "");
		}
		
		//now set the current column sorting icon
		for(var c= 0; c < cells.length ; c++) {
			var colId = cells[c].getAttribute("col_id");
			
			if(colId == sortColumn) {
				cells[c].className += (sortOrder == 1) ? " SortAsc " : " SortDesc ";
				break ;
			}
		}
	},
	
	render: function(dataset) {
		var grid = $("tblContent") ;

		PersonGrid.currentRow = -1;
		
		var tbody = null ;
		if(grid.tBodies && grid.tBodies.length > 0) {
			tbody = grid.tBodies[0] ;
		} else {
			tbody = grid.createTBody();
		}

		//add rows
		if(dataset && dataset.length > 0) {
			//create a row for each person and add columns to it
			
			for(var i= 0; i < dataset.length; i++) {
				var person = dataset[i] ;

				//insert row at a given position, -1 indicates at the end
				var row = tbody.insertRow(-1) ;
				
				var cell = row.insertCell(-1);
				cell.innerHTML = person.id ;

				cell = row.insertCell(-1);
				cell.innerHTML = "<a href='javascript:App.showPerson(\"" + person.id + "\", " + i + ")'>" + person.name + "</a>";
				
				cell = row.insertCell(-1);
				cell.innerHTML = person.age ;
				
				cell = row.insertCell(-1);
				cell.innerHTML = person.place ;
			}
		}
		
	},
	
	highlightRow: function(idx) {
		var tbody = $("tblContent").tBodies[0] ;
		
		//first clear out the old row highlighting
		if(PersonGrid.currentRow >= 0) {
			var row = tbody.rows[PersonGrid.currentRow] ;
			
			//replace the highlight class with blank using regular expression (it replaces the first occurrence) 
			row.className = row.className.replace(/ RowHighlight / , "") ;
			
			//if you wanted to replace all occurences, if any, then use "/g" hint 
			//row.className = row.className.replace(/ RowHighlight /g , "") ;
		}
		
		//now highlight current row
		var row = tbody.rows[idx] ;
		row.className += " RowHighlight " ;
		
		PersonGrid.currentRow = idx ;
	},

	/**
	 * Just for reference: showcases different ways of adding DOM nodes dynamically 
	 */
	render_Approaches: function(dataset) {
		var grid = $("tblContent") ;

		var tbody = null ;
		if(grid.tBodies && grid.tBodies.length > 0) {
			tbody = grid.tBodies[0] ;
		} else {
			tbody = grid.createTBody();
		}

		//add rows
		if(dataset && dataset.length > 0) {
			//create a row for each person and add columns to it
			
			for(var i= 0; i < dataset.length; i++) {
				var person = dataset[i] ;

				if(i == 0) {
					//Approach 2: one way of doing is create TR element and append it to the tbody
					var row  = document.createElement("TR") ;
		
					//add s.no. column
					var cell = document.createElement("TD") ;
					cell.innerHTML = person.id ;
					row.appendChild(cell) ;
		
					// Name
					cell = document.createElement("TD") ;
					cell.innerHTML = person.name ;
					row.appendChild(cell) ;
					
					// age
					cell = document.createElement("TD") ;
					cell.innerHTML = person.age ;
					row.appendChild(cell) ;
		
					// place
					cell = document.createElement("TD") ;
					cell.innerHTML = person.place ;
					row.appendChild(cell) ;
		
					//add the row tbody
					tbody.appendChild(row) ;
				} else if(i == 1) {
					//approach 3: mixed 
					var row = document.createElement("TR");
					
					row.innerHTML = "<td>" + person.id+ "</td>"  +
							"<td>" + person.name+ "</td>" +
							"<td>" + person.age+ "</td>" +
							"<td>" + person.place + "</td>" ;
					
					tbody.appendChild(row) ;
					
				} else {
					//approach 4: use element method itself
					
					//insert row at a given position, -1 indicates at the end
					var row = tbody.insertRow(-1) ;
					var cell = row.insertCell(-1);
					cell.innerHTML = person.id ;

					cell = row.insertCell(-1);
					cell.innerHTML = person.name ;
					
					cell = row.insertCell(-1);
					cell.innerHTML = person.age ;
					
					cell = row.insertCell(-1);
					cell.innerHTML = person.place ;
				}
			}
		}
	}
	
};
