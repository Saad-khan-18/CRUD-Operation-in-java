class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();
        int length = product.getArrayLength();
        System.out.println("======== Creation ========");
        System.out.println("The Array is created of length: " + length);

        System.out.println("======== Insertion ========");
        product.insertProductNames("Laptop");
        product.insertProductNames("Smartphone");
        product.insertProductNames("Tablet");
        product.insertProductNames("Smartwatch");

        System.out.println("======== Reading ========");
        product.readProductNames();

        System.out.println("======== Updating ========");
        product.updateProductName("Tablet", "Camera");
        product.readProductNames();

        System.out.println("======== Deleting ========");
        product.deleteProductName("Camera");
        product.readProductNames();

        System.out.println("======== Searching ========");
        String search = product.searchProductName("Smartphone");
        System.out.println("Result: " + search);
    }
}
