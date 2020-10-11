pipelineJob('spotter-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:justintjoa-portfolio/ARTracker.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}