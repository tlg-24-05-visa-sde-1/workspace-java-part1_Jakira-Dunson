package com.makeup;

public class FentyBeauty {

    // instance variables
    private String primer;
    private FoundationType foundation;
    private ConcealerType concealer;
    private int foundationNumber;
    public static final int FOUNDATION_NUMBER_MIN = 1;
    public static final int FOUNDATION_NUMBER_MAX = 25;
    private int concealerNumber;
    public static final int CONCEALER_NUMBER_MIN = 100;
    public static final int CONCEALER_NUMBER_MAX = 498;
    private String mascara;
    private String blush;

    //constructors

    public FentyBeauty() {}

    public FentyBeauty(String primer, FoundationType foundation) {
        setPrimer(primer);
        setFoundation(foundation);
    }

    public FentyBeauty(String primer,FoundationType foundation, ConcealerType concealer) {
        this(primer, foundation);
        setConcealer(concealer);
    }

    public FentyBeauty(String primer, FoundationType foundation, ConcealerType concealer, String mascara) {
        this(primer, foundation, concealer);
        setMascara(mascara);
    }
    public FentyBeauty(String primer, FoundationType foundation, int foundationNumber, ConcealerType concealer, int concealerNumber, String mascara, String blush) {
        this(primer, foundation,concealer,mascara);
        setFoundationNumber(foundationNumber);
        setConcealerNumber(concealerNumber);
        setBlush(blush);
    }

    public void whatMakeupIsUsed() {
        System.out.println("The makeup used are the following: " + getPrimer() + ", " + getFoundation() + ", " + getConcealer() + ", " + getMascara() + ", " + getBlush());
    }

    public void numberOfTheMakeup() {
        System.out.println("The foundation number is " + getFoundationNumber() + " and the concealer number is " + getConcealerNumber());
    }


    //Getters and Setters
    public String getPrimer() {
        return primer;
    }

    public void setPrimer(String primer) {
        this.primer = primer;
    }

    public FoundationType getFoundation() {
        return foundation;
    }

    public void setFoundation(FoundationType foundation) {
        this.foundation = foundation;
    }

    public ConcealerType getConcealer() {
        return concealer;
    }

    public void setConcealer(ConcealerType concealer) {
        this.concealer = concealer;
    }

    public int getFoundationNumber() {
        return foundationNumber;
    }

    public void setFoundationNumber(int foundationNumber) {
        if (foundationNumber >= FOUNDATION_NUMBER_MIN && foundationNumber <= FOUNDATION_NUMBER_MAX) {
            this.foundationNumber = foundationNumber;
        } else {
            System.out.println("Invalid foundation number, please enter a valid number between " + FOUNDATION_NUMBER_MIN + " and " + FOUNDATION_NUMBER_MAX + ".");
        }
    }

    public int getConcealerNumber() {
        return concealerNumber;
    }


    public void setConcealerNumber(int concealerNumber) {
        if (concealerNumber >= CONCEALER_NUMBER_MIN && concealerNumber <= CONCEALER_NUMBER_MAX) {
            this.concealerNumber = concealerNumber;
        } else {
            System.out.println("Invalid concealer number, please enter a valid number between " + CONCEALER_NUMBER_MIN + " and " + CONCEALER_NUMBER_MAX + ".");
        }
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getBlush() {
        return blush;
    }

    public void setBlush(String blush) {
        this.blush = blush;
    }

    //toString
    @Override
    public String toString() {
        return String.format("Primer: %s\nFoundation: %s\nFoundation Number: %d\nConcealer: %s\nConcealer Number: %d\nMascara: %s\nBlush: %s",
                getPrimer(), getFoundation(), getFoundationNumber(), getConcealer(),
                getConcealerNumber(), getMascara(), getBlush());
    }

}

