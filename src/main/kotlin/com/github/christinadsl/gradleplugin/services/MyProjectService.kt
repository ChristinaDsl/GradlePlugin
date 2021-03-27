package com.github.christinadsl.gradleplugin.services

import com.github.christinadsl.gradleplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
