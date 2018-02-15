package stragegy;

import stragegy.taxStrategy.FileAlgorithm;

public class TaxFiler {

    public TaxFiler(FileAlgorithm filingAlgorithm) {
        this.filingAlgorithm = filingAlgorithm;
    }

    private FileAlgorithm filingAlgorithm;

    public FileAlgorithm getFilingAlgorithm() {
        return filingAlgorithm;
    }

    public void setFilingAlgorithm(FileAlgorithm filingAlgorithm) {
        this.filingAlgorithm = filingAlgorithm;
    }

    public void file(){
        getFilingAlgorithm().file();
    }
}
