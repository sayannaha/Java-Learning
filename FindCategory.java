package com.tutorial.DSA;
import java.time.LocalDate;
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
    public LocalDate deliveryDate(String product, int distance) {
    	LocalDate currentDate = LocalDate.now();
        if (product != null) {
            if (distance <= 15) {
                return currentDate;
            } else if (distance <= 30) {
                return currentDate.plusDays(1);
            } else {
                return currentDate.plusDays(3);
            }
        }
        return null;
    }
}
