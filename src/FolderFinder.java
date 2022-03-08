import java.io.File;

public class FolderFinder {
    public static void main(String[] args) {
        String path = "G:\\Notepad++";
        startFind(path);
        System.out.println("Count file:"+countFile+", count folder:"+countFolder);
    }
    static int countFile, countFolder;
    public static void find(String path){
        File file = new File(path);
        String[] lst = file.list();
        for(int i=0;i<lst.length;i++){
            File f = new File(path+"\\"+lst[i]);
            System.out.println(f.getPath());
            if(f.isDirectory()){
                find(f.getPath());
                countFolder++;
            }
            else
                countFile++;
        }
    }
    public static void startFind(String path){
        countFile =0;
        countFolder =0;
        find(path);
    }
}
