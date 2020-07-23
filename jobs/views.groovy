listView('PythonView') {
    description ('Python Pipelines')
    jobs {
        regex(/.*jenkins.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastDuration()
        buildButton()
    }
}
