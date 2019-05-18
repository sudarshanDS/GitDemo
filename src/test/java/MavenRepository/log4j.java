package MavenRepository;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class log4j {
	private static Logger log=LogManager.getLogger(base.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         log.debug("debugging");
    	log.error("not present");
        log.fatal("fatalerror");
    	 log.info("object os present");
    
   
	}

}
