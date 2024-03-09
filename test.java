public class test {
    public static void main(String[] args) {
        FindCategory first = new FindCategory();
        String getCat = first.getCategory("MOBILE");
        System.out.println("\nCategory is : " + getCat + ", MRP : Rs." + first.getPrice(getCat) + ", Delivery Date : "
                + first.deliveryDate(getCat, 3));
    }
}
