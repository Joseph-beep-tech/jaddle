

package dao;

import models.FoodType;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oFoodTypeDAO implements FoodtypeDAO{ //don't forget to shake hands with your interface!
    private final Sql2o sql2o;
    public Sql2oFoodTypeDAO(Sql2o sql2o){ this.sql2o = sql2o; }

    @Override
    public void add(FoodType foodtype) {
        String sql = "INSERT INTO foodTypes (name) VALUES (:name)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(foodtype)
                    .executeUpdate()
                    .getKey();
            foodtype.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<FoodType> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM foodTypes")
                    .executeAndFetch(FoodType.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from foodTypes WHERE id=:id"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE from foodTypes";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}