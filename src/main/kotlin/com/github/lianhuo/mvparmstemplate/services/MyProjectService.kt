package com.github.lianhuo.mvparmstemplate.services

import com.intellij.openapi.project.Project
import com.github.lianhuo.mvparmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
