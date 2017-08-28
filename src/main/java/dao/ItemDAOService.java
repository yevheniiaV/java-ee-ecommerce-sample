package dao;

import entity.Item;
import java.util.List;

public class ItemDAOService {
    private final ItemDAO idao;

    public ItemDAOService(ItemDAO idao) {
        this.idao = idao;
    }    
    
    public List<Item> getAll(){
        return idao.get();
    }
    
    public Item getById(int id){
        return idao.getById(id);
    }
}
