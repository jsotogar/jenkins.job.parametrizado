job('DSL-Job-example-GitHub') {
  description('First DSL Job for Jenkins Training')
  scm {
    git('https://github.com/jsotogar/jenkins.job.parametrizado.git', 'main') { node ->
      node / gitConfigName('jsotogar')
      node / gitConfigEmail('mailsuperpowered@gmail.com')
    }
  }
  parameters {
    stringParam('name', defaultValue = 'Jorge', description = 'String parameter for boolean job')
    choiceParam('planet', ['Mercury', 'Venus', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'Uranus', 'Neptune'])
    booleanParam('agent', false)
  }
  triggers {
    cron('H/7 * * * *')
  }
  steps {
    shell("bash jobscript.sh")
  }
  publishers {
    mailer('jsotogar@gmail.com', true, true)
  }
}
