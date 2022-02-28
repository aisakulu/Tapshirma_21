package tapshirma_21;

public enum Days {
    MONDAY( "Дуйшомбу куну жава окуйм"),
    TUESDAY ("Экинчи куну жумушта болом"),
    WEDNESDAY ("Учунчу куну курска барам"),
    TURSDAY ("Тортуняу куну оз алдынча сабак окуйм"),
    FRIDAY ("Жума куну жумага барам"),
    SATURDAY ("Алтынчы куну уй булом менен убакыт откором"),
    SUNDAY ("Эртеден кечке путту асып койуп уктайм");

    private  String toDoList;

    Days() {
    }

    Days(String toDoList) {
        this.toDoList = toDoList;
    }

    public String getToDoList() {
        return toDoList;
    }

    @Override
    public String toString() {
        return toDoList;
    }
}
