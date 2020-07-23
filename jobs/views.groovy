listView('Jenkins Named  Projects View') {
    description ('Jenkins Named Pipelines')
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
