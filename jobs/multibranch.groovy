multibranchPipelineJob('example') {
    triggers {
        periodic(1)
    }    
    branchSources {
        git {
            remote("https://github.com/jjulianprin/test-jenkins-1.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
