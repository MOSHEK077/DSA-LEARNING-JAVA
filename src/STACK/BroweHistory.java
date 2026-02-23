package STACK;

import java.util.Stack;

public class BroweHistory {
    private Stack<String> historyStack;
    private String currentPage;

    public BroweHistory(){ //Constructor runs automatically when you run the program.No need to create a obj.
        historyStack = new Stack<String>();
        currentPage = null;
    }
    public void visit(String url){
        if(currentPage != null){
            historyStack.push(currentPage);
        }
        currentPage = url;
        System.out.println("Visiting :"+url);
    }

    public String back(){
        if(historyStack.isEmpty()){
            System.out.println("No page in History !");
            return null;
        }
        currentPage = historyStack.pop();
        System.out.println("Going back to: " + currentPage);
        return currentPage;
    }

    public String current(){
        return currentPage;
    }

    public static void main(String[] args) {
        BroweHistory broweHistory = new BroweHistory();
        broweHistory.visit("google.com");
        broweHistory.visit("youtube.com");
        broweHistory.visit("w3school.com");
        broweHistory.visit("github.com");

        System.out.println(broweHistory.current());
        broweHistory.back();
        broweHistory.back();
        broweHistory.back();

        System.out.println(broweHistory.current());

    }
}
/*

import java.util.Stack;

class BrowserHistory {
    private Stack<String> historyStack;
    private String currentPage;

    public BrowserHistory() {
        historyStack = new Stack<>();
        currentPage = null;
    }

    public void visit(String url) {
        if (currentPage != null) {
            historyStack.push(currentPage);
        }
        currentPage = url;
        System.out.println("Visiting: " + url);
    }

    public String back() {
        if (historyStack.isEmpty()) {
            System.out.println("No pages in history!");
            return null;
        }

        currentPage = historyStack.pop();
        System.out.println("Going back to: " + currentPage);
        return currentPage;
    }

    public String current() {
        return currentPage;
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        System.out.println("\nCurrent page: " + browser.current());

        browser.back();  // Returns to github.com
        browser.back();  // Returns to youtube.com
        System.out.println("Current page: " + browser.current());
    }
}

 */