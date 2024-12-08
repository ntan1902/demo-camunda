package org.demo.democamunda;

import jakarta.annotation.PostConstruct;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private RepositoryService repositoryService;

    @GetMapping("/say-hello")
    public String startSayHelloProcess() {
        runtimeService.startProcessInstanceByKey("hello-process");
        return "hello-process started";
    }

    @GetMapping("/order")
    public String startOrderProcess() {
        runtimeService.startProcessInstanceByKey("order-process");
        return "order-process started";
    }
}