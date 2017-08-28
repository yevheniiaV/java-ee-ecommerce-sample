package dao;


import entity.Cartitem;

import java.util.List;

public class CartItemDAOService {

    private final CartItemDAO cartItemDAO;

    public CartItemDAOService(CartItemDAO cartItemDAO) {
        this.cartItemDAO = cartItemDAO;
    }

    public List<Cartitem> get() {
        return cartItemDAO.get();
    }

    public List<Cartitem> getByUser(int user_id) {
        return cartItemDAO.getByUser(user_id);
    }

    public Cartitem getByItem(int item_id) {
        return cartItemDAO.getByItem(item_id);
    }

    public void updateAddingQuantityOfItem(int item_id){
        cartItemDAO.updateAddingQuantityOfItem(item_id);
    }

    public void updateSubstractingQuantityOfItem(int item_id){
        cartItemDAO.updateSubstractingQuantityOfItem(item_id);
    }

    public void add(Cartitem ci) {
        cartItemDAO.add(ci);
    }
}
