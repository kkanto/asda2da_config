 
listView('asda2da Jobs') {
    description('asda2da Jobs')
    jobs {
        regex('asda2da_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
