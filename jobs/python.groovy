project_name = "jenkins-declarativepipeline-python"
repo = "https://github.com/jjulianprin/test-jenkins-1.git"
repo_name = "repo"

folder('Project-a') {
    displayName('Project A')
    description('Folder for project A')
}

pipelineJob(Project-a/project_name) {
    definition {
        triggers{
            scm('H/1 * * * *')
        }

        cpsScm{
            scm {
                git{
                    remote {
                        name(repo_name)
                        url(repo)
                    }
                }
                scriptPath("Jenkinsfile")
            }
        }
    }
}
