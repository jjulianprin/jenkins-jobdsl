multibranchPipelineJob('example') {
    triggers {
        periodic(1)
    }    
    branchSources {
        git {
            id('123') // IMPORTANT: use a constant and unique identifier
            remote("https://github.com/jjulianprin/test-jenkins-1.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
