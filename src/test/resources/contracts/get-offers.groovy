import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/offers'
        headers {
            contentType applicationJson()
        }
    }
    response {
        status 200
        headers {
            contentType applicationJson()
        }
        body([
                [
                        id       : 1L,
                        offerName: 'Hulk Pop',
                        price    : '10',
                        currency : 'CHF'
                ],
                [
                        id       : 2L,
                        offerName: 'Darth Vader Pop',
                        price    : '12',
                        currency : 'EUR'
                ],
                [
                        id       : 3L,
                        offerName: 'Merlin Pop',
                        price    : '600',
                        currency : 'MKD'
                ]
        ])
    }
}
