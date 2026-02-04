package com.autofix.pipeline.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/analyze")
public class AnalyzerController {

    @PostMapping
    public Map<String, String> analyzeLogs(@RequestBody Map<String, String> payload) {

        String logs = payload.get("logs");

        Map<String, String> response = new HashMap<>();

        if (logs == null || logs.isEmpty()) {
            response.put("error", "Logs are empty");
            response.put("fix", "Send CI logs in request body under 'logs' key");
            return response;
        }

        if (logs.contains("no such file or directory") && logs.contains("target")) {
            response.put("error", "Docker build failed");
            response.put("cause", "Jar file not generated before Docker build");
            response.put("fix", "Run 'mvn package' before docker build in CI");
        } else {
            response.put("status", "Unknown error");
            response.put("suggestion", "Add more logs for analysis");
        }

        return response;
    }

}
