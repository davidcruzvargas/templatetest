package com.github.davidcruzvargas.templatetest.services

import com.intellij.openapi.project.Project
import com.github.davidcruzvargas.templatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
