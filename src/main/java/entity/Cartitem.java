package entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cartitem")
public class Cartitem implements Serializable{

    @Id
    int id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Item item;
    private int quantity;


    public Cartitem() {
    }

    public Cartitem(User user, Item item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cartitem{" +
                "user=" + user +
                ", item=" + item +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cartitem cartitem = (Cartitem) o;


        if (quantity != cartitem.quantity) return false;
        if (user != null ? !user.equals(cartitem.user) : cartitem.user != null) return false;
        return item != null ? item.equals(cartitem.item) : cartitem.item == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}

