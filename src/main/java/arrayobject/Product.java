package arrayobject;
    public class Product implements Comparable<Product> {
        private double weight;
        private double price;
        private int id;
        public Product(double weight, double price, int id) {
            this.weight = weight;
            this.price = price;
            this.id = id;
        }
        @Override
        public int compareTo(Product otherProduct) {
            return Double.compare(this.price, otherProduct.price);
        }
        public static void main(String[] args) {
            Product product1 = new Product(1.5, 2.0, 10);
            Product product2 = new Product(0.5, 15.0, 102);
            int result = product1.compareTo(product2);
            if(result < 0) {
                System.out.println("Product 1 is cheaper than Product 2");
            } else if (result > 0) {
                System.out.println("Product 1 is more expensive than Product 2");
            } else {
                System.out.println("Both products have the same price");
            }
        }
    }


