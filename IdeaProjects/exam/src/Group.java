import java.awt.*;
import java.util.ArrayList;
public class Group {
    private ArrayList<Bird> birds;
    public Group(){
        birds = new ArrayList<Bird>();
    }
    public void add(Bird b){
        if (birds.indexOf(b) == -1)
            birds.add(b);
    }
    public Group uniuon(Group g){
        Group new_group = new Group();
        for(int i = 0; i < this.birds.size(); i++){
            new_group.add(this.birds.get(i));
        }
        for(int i = 0; i < g.birds.size(); i++){
            new_group.add(g.birds.get(i));
        }
        return new_group;
    }
    public void draw(Graphics g){
        for (int i = 0; i < birds.size(); i++){
            birds.get(i).draw(g);
        }
    }
}
