import React from "react"
class ListOfVideos extends React.Component {
    constructor(props) {
        super(props)
        this.state = {data: []}
    }
    async componentDidMount() {
        const response = (await fetch("/api/videos"));

        if (!response.ok) {
            throw new Error(`Error! status: ${response.status}`);
        } else {
            console.log(`Status: ${response.status}`)
        }

        const json = await response.json();
        this.setState({data: json})
    }
    render() {
        return (
            <ul>
                {this.state.data.map(item =>
                    <li>
                        {item.name}
                    </li>)}
            </ul>
        )
    }
}
export default ListOfVideos