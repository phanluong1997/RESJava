/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Admin
 */
public class MyKnowledgeModel {
    DataSource source;
    Instances dataset;
//    String[] model_options;
//    String[] data_options;
    

    public MyKnowledgeModel( ) {
    }
     public MyKnowledgeModel( String filename) throws Exception {
         this.source = new DataSource(filename);
         this.dataset=source.getDataSet();
//         this.model_options = weka.core.Utils.splitOptions(m_opts);
//          this.model_options = weka.core.Utils.splitOptions(d_opts);
         
         
    }
     public void saveData(String filename) throws IOException
     {
     ArffSaver outData = new ArffSaver();
     outData.setInstances(this.dataset);
     outData.setFile(new File(filename));
     outData.writeBatch();
         System.out.println("saved");
     }

     public void saveData2CSV(String filename)throws IOException{
         CSVSaver outData = new CSVSaver();
         outData.setInstances(this.dataset);
         outData.setFile(new File(filename));
         outData.writeBatch();
         System.out.println("Converted");
         
     
     }
    @Override
    public String toString() {
        return dataset.toSummaryString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
