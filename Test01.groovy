pipelineJob('job-dsl-plugin') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('git@github.com:ajay1989s/petclinic.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
