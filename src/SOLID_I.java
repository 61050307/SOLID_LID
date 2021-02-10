/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siraphat
 */
class Document {
}

interface Machine {

    void print(Document d);

    void fax(Document d) throws Exception;

    void scan(Document d) throws Exception;
}

class MultiFunctionPrinter implements Machine {

    @Override
    public void print(Document d) {
    }

    @Override
    public void fax(Document d) {
    }

    @Override
    public void scan(Document d) {
    }
}

class OldFashionPrinter implements Machine {

    @Override
    public void print(Document d) {
    }

    @Override
    public void fax(Document d) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan(Document d) {
        throw new UnsupportedOperationException();
    }
}

interface Printer {

    void print(Document d);
}

class JustAPrinter implements Printer {

    @Override
    public void print(Document d) {
    }
}

class Photocopier implements Printer, Scanner {

    @Override
    public void print(Document d) {
    }

    @Override
    public void scan(Document d) {
    }
}

interface Scanner {

    void scan(Document d);
}

interface Fax {

    void fax(Document d);
}

public class SOLID_I {

}
