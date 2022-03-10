
import java.util.ArrayList;

public class MyFlipKart {
    public ProductsCatalog productsCatalog;

    public MyFlipKart() {
        productsCatalog = new ProductsCatalog();
    }

    public static void main(String[] args) {
        

        
        Customer mehak = new Customer("Mehak sharma","8219663373");

        
        Seller dailyNeedsGrocery = new Seller("Daily Needs Groceries","8219663373");

        
        Seller fashionPoint = new Seller("Fashion Point","8219663373");

        
        Seller digiElectronics = new Seller("Digi Electronics","8219663373");

        
        Category electronics = new Category("Electronics");

        
        Category cosmetics = new Category("Cosmetics");

        
        Category grocery = new Category("Groceries");

        
        Category clothing = new Category("Clothing");

        

        MyFlipKart myFlipKart = new MyFlipKart();

        
        myFlipKart.productsCatalog.addCategory(clothing);
        myFlipKart.productsCatalog.addCategory(grocery);
        myFlipKart.productsCatalog.addCategory(cosmetics);
        myFlipKart.productsCatalog.addCategory(electronics);

    
        digiElectronics.registerProduct(myFlipKart.productsCatalog,
        new Product("Mobile","Latest Technology",10000.00,electronics,5));

        
        digiElectronics.registerProduct(myFlipKart.productsCatalog, 
        new Product("Camera","Advanced Technology",50000.00,electronics,10));

        
        fashionPoint.registerProduct(myFlipKart.productsCatalog, 
        new Product("Mens Jackets","XL - Size",1000.00,clothing,10));
        
        fashionPoint.registerProduct(myFlipKart.productsCatalog, 
        new Product("Jackets","XL - Size",1000.00,clothing,10));
        
        
        fashionPoint.registerProduct(myFlipKart.productsCatalog, 
        new Product("Nail Paint","Red Color",500.00,cosmetics,25));

        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, 
        new Product("Sugar","Fine quality",40.00,grocery,1000));

        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, 
        new Product("Milk","100% Pure",50.00,grocery,250));
        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, 
        new Product("Toned Milk","Hygenic and Pure",45.00,grocery,250));
        
        dailyNeedsGrocery.registerProduct(myFlipKart.productsCatalog, 
        new Product("Milk Cream","Natural",145.00,grocery,100));


        
        ArrayList<Product> milkResults = myFlipKart.productsCatalog.searchProduct("Milk");
    

        
        Item milkTenPackets = new Item(milkResults.get(0),10);
        mehak.addItemToCart(milkTenPackets);

        
        mehak.printCartItems();

        
        ArrayList<Product> cameraResults = myFlipKart.productsCatalog.searchProduct("CaMeRa");
        

        
        Item oneCamera = new Item(cameraResults.get(0),1);
        mehak.addItemToCart(oneCamera);

        
        mehak.printCartItems();

        
        mehak.updateItemCount(milkTenPackets,15);

        
        mehak.printCartItems();

        
        mehak.placeOrder();

        
        mehak.printCartItems();

        
        System.out.println(mehak.getCurrentOrder());

        
        Shipment s = mehak.getCurrentOrder().moveToShipment();

        
        System.out.println(s);


    }
}
