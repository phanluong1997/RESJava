/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

/**
 *
 * @author Admin
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        MyKnowledgeModel model = new MyKnowledgeModel("C:\\Program Files\\Weka-3-8\\data\\weather.numeric.arff");
        System.out.println(model);
        model.saveData("D:\\data\\weather.numeric.arff");
        model.saveData2CSV("D:\\data\\weather.numeric_CSV.csv");
        

//        MyAprioriModel model = new MyAprioriModel("C:\\Program Files\\Weka-3-8\\data\\supermarket.arff",
//                "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1",
//        "-R 1-9,11,57,70,79-81,88-89,98,100-102,107-114,116-120,122-130,137-179,189,192-199,201-216");
//        model.khaiPha();
//        System.out.println(model);
    }
    
}
