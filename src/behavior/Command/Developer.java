package behavior.Command;

public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }
    public void insert(){
        insert.execute();
    }
    public void update(){
        update.execute();
    }
    public void select(){
        select.execute();
    }
    public void delete(){
        delete.execute();
    }
}
