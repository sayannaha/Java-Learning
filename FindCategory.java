import java.sql.Date;

public class FindCategory {
    public String getCategory(String input) {
        String categories[] = { "MOBILE", "TV", "CLOTH", "HOME", "KITCHEN", "PET", "TOY", "RANDOM" };
        for (int i = 0; i < categories.length; i++) {
            if ((input.toUpperCase()).contains(categories[i])) {
                return categories[i];
            }
        }
        return null;
    }

    public Double maxRPrice(String product) {
        return (product.length() * 1000 / .75);
    }

    public Double getPrice(String product) {
        Double price = null;
        String catg = getCategory(product);
        if (catg != null) {
            price = maxRPrice(product);
        }
        return price;
    }

    public Date deliveryDate(String product, int distance) {
        Date currentDate = new Date(distance);
        if (product != null) {
            if (distance <= 15) {
                return currentDate;
            } else if (distance <= 30) {
                return currentDate;
            } else {
                return currentDate;
            }
        }
        return null;
    }
}