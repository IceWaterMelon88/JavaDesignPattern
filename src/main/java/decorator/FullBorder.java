package decorator;

public class FullBorder extends Border {


    public FullBorder(Widget widget) {
        super(widget);
    }

    @Override
    public int getColumns() {
        return widget.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return widget.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == getRows() - 1){
            return "+" + makeLine('-', widget.getColumns()) + "+";
        }
        return "|" + widget.getRowText(row - 1) + "|";
    }

    private String makeLine(char ch, int count){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
