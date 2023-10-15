package browser1;

public class Link {
   
    private String linkp;
    private String linkdd;
    
    public Link() {
    }

    public String getLink() {
        return linkp;
    }

    public void setLink(String linkp) {
        this.linkp = linkp;
    }
    
    public String getLinkDate() {
        return linkdd;
    }

    public String setLinkDate(String linkdd) {
        this.linkdd = linkdd;
        return linkdd; 
    }
}
