package proxy;

public class PrintProxy implements Printable {
    private String name; // 이름
    private Printer real; // 실체

    public PrintProxy() {
        this.name = "No Name";
        if (real != null) {
            real.setPrinterName(name);
        }
    }

    public PrintProxy(String name) {
        this.name = name;
        this.real = null;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }


}