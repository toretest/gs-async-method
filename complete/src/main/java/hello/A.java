package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class A { //implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(A.class);

    private final GitHubLookupService gitHubLookupService;

    public A(GitHubLookupService gitHubLookupService) {
        this.gitHubLookupService = gitHubLookupService;
    }

//    @Override
//    public void run(String... args) throws Exception {
//        // Start the clock
//        long start = System.currentTimeMillis();
//
//        // Kick of multiple, asynchronous lookups
//        CompletableFuture<User> page1 = gitHubLookupService.findUser("PivotalSoftware");
//        CompletableFuture<User> page2 = gitHubLookupService.findUser("CloudFoundry");
//        CompletableFuture<User> page3 = gitHubLookupService.findUser("Spring-Projects");
//
//        // Wait until they are all done
//        CompletableFuture.allOf(page1,page2,page3).join();
//
//        // Print results, including elapsed time
//        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
//        logger.info("--> " + page1.get());
//        logger.info("--> " + page2.get());
//        logger.info("--> " + page3.get());
//
//    }

}
