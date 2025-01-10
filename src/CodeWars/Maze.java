package CodeWars;

import java.util.HashMap;
import java.util.Map;
//TODO à finir
public class Maze {
    
    public static boolean hasExit(String[] maze) {
        HashMap<Integer, Integer> cursorList = new HashMap<>();
        
        int kCounter = 0;
        for (String line : maze  ) {
            for (char sign : line.toCharArray() ) {
                if(sign == 'k') kCounter++;
            }
        }
        if (kCounter != 1) return false; 
        
        if (maze[0].contains(" ")) cursorList.put(0, maze[0].lastIndexOf(" "));
        else if (maze[maze.length-1].contains(" ")) cursorList.put(maze.length - 1, maze[maze.length-1].lastIndexOf(" "));
        else{
            for (int i =1 ; i< maze.length-1 ; i++){
                if (maze[i].startsWith(" ")) cursorList.put(i, 0);
                if (maze[i].endsWith(" ")) cursorList.put(i, maze[i].lastIndexOf(" "));
                }
                if(cursorList.isEmpty()) return false;
            }
        
        boolean potentialWayOut = true;
        while( potentialWayOut){
            
            
            
        }
        
        
        
        {
            
       
        }

        
        
            
            

        return false;
    }
    
}