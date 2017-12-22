def myJob = freeStyleJob('SimpleJob')
myJob.with {
    description 'A Simple Job'
}

buildPipelineView("TEST_Pipeline") {
  filterBuildQueue()
  filterExecutors()
  title('TEST Pipeline')
  displayedBuilds(30)
  selectedJob(myJob.name)
  alwaysAllowManualTrigger()
  showPipelineParameters()
  refreshFrequency(60)
  startsWithParameters()
  showPipelineParametersInHeaders()
}