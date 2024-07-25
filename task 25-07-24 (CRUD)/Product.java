class Product {
    String[] products = new String[4];
    int index = 0;

    public int getArrayLength() {
        return products.length;
    }

    public String insertProductNames(String productName) {
        if (this.index < this.getArrayLength()) {
            products[index] = productName;
            System.out.println(index + ":" + products[index]);
            index++;
            return "Inserted Successfully";
        }
        return "Not Inserted";
    }

    public void readProductNames() {
        for (String name : products) {
            System.out.println("- " + name);
        }
    }

    public String updateProductName(String oldProductName, String newProductName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (products[i].equals(oldProductName)) {
                products[i] = newProductName;
                return "Updated Successfully";
            }
        }
        return "Not Found";
    }

    public String deleteProductName(String productName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (products[i].equals(productName)) {
                products[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Deleted";
    }

    public String searchProductName(String productName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (products[i] != null && products[i].equals(productName)) {
                return "Search Product Found: " + productName;
            }
        }
        return "Not Found";
    }
}
