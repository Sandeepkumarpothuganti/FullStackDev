package io.ipivot.matka;



public class PakageManager {

	private TravelPackage[] packages;

	int currentSize = 5;

	public PakageManager() {
		// build array of packages to load at start up.
		super();
		packages = new TravelPackage[20];

		TravelPackage pkg;

		for (int i = 0; i < 5; i++) {
			pkg = new TravelPackage();
			pkg.setId("pkg" + i);
			pkg.setName("name-" + i);
			pkg.setPrice(100 + i);
			packages[i] = pkg;

		}
	}

	public TravelPackage[] getAllPackages() {
		System.out.println("*************Packages availabl are*************");
		for (int i = 0; i < currentSize; i++)
			System.out.println(packages[i]);

		return packages;
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void deletePackage(String id) {

		System.out.println("deleted elements are");
		for (int i = 0; i < currentSize; i++) {
			TravelPackage pkg1 = packages[i];
			if (pkg1.getId().equalsIgnoreCase(id)) {
				packages[i] = null;
			}
		
		}
for(int i=0; i<currentSize;i++){
System.out.println(packages[i]);	
}
	}

	public String getPackages(String id) {

		String response = null;

		switch (id.toLowerCase()) {
		case "gold":
			response = "you selected gold package";
			break;
		case "silver":
			response = "you selected silver package";
			break;
		case "bronze":
			response = "you selected bronze package";
			break;
		}

		return response;
	}

	public void addPackage(TravelPackage newPkg) {
//		System.out.println("the new elements to add are");
		packages[currentSize] = newPkg;
		newPkg.setId("pkg5");
		newPkg.setName("sandy");
		newPkg.setPrice(400);
		currentSize = currentSize + 1;
		System.out.println("******************************array elements are*********************");
		for (int i = 0; i < currentSize; i++) {
			 System.out.println( packages[i]);
		}
	}

	public void updatePackageById(String id) {
		for(int i=0; i< currentSize;i++)
		{
			TravelPackage newPkg=packages[i];
			if(newPkg.getId().equalsIgnoreCase(id)){
				newPkg.setId("pkg6");
			newPkg.setName("sandy2");
			newPkg.setPrice(4000);
			}	
		}
		
		System.out.println("updated elmenets are");
		for (int i = 0; i < currentSize; i++) {
			 System.out.println( packages[i]);
		}
	}

}
