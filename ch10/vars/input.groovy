def call(Map params = [:]) {
    timeout(time: 1, unit: 'HOURS') {
        return steps.input(params)
    }
}
