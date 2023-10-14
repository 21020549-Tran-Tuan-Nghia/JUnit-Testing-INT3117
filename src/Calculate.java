public class Calculate {
    public int getPrice(boolean isOld, double height) {
        int price = -1;
        if (isOld == true) {
            if (height > 0 && height <= 2.1) {
                price = 0;
            }
        } else {
            if (height >= 0 && height <= 1.5) {
                price = 100000;
            } else if (height > 1.5 && height <= 1.7) {
                price = 150000;
            } else if (height > 1.7 && height <= 2.1) {
                price = 200000;
            }
        }
        return price;
    }
}
