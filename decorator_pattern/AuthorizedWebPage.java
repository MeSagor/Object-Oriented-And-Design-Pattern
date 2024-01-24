class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedPage) {
        super(decoratedPage);
    }

    @Override
    public void display() {
        checkAuthorization();
        super.display();
    }

    private void checkAuthorization() {
        System.out.println("Checking user authorization...");
        System.out.println("User authorized.");
    }
}