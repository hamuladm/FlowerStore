package flower;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public void setQuantity(int quantity) {
        // this.quantity = quantity < 1 ? 1 : quantity;
        if (quantity < 1) {
            this.quantity = 1;
        }
        else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
