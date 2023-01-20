package udemy;
/*        1. addToner will accept one parameter, tonerAmount of type int. First off, tonerAmount should be greater than 0 and less than
    or equal to 100. If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount is greater
    than 100. If so, the method should return -1. If not then tonerLevel should have the incoming tonerAmount added to it and the new
    tonerLevel should then be returned by the method.
    Also, if the initial condition test fails, then the method should return -1.
        2. printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created and initialized
    to the value of the incoming parameter.   A conditional check should be performed on whether the Printer class field, duplex,
    is either "true" or "false". If "true" then a calculation must be performed to determine the number of pages needed to print
    the job double sided. The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint
    should be returned by the method.*/
public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel>-1 || tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.duplex = duplex;

        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if((tonerLevel + tonerAmount) > 100){
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;

        }else{
            return -1;
        }

    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        if(duplex){
            pagesToPrint = (pages/2)+(pages%2);
        }
        this.pagesPrinted = pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
