// Composition
public class TableToText2 implements Text{
    Table table = new Table();
    @Override
    public void enterText() {
        table.enterTextInTable();
    }
}
