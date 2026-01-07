import { Link } from 'react-router-dom'

export default function Navbar(){
    return(
        <nav className='bg-white shadow-md px-8 py-4 flex justfiy-between items-center'>
            <h1 className='text-2xl font-bold text-primary'>GhibliAI</h1>

            <div className="space-x-6 text-gray-700 font-medium">
                <Link to="/">Home</Link>
                <Link to="/create">Create</Link>
                <a href="#features">Features</a>
                <a href="#gallery">Gallery</a>
                <a href="#faq">FAQ</a>
            </div>
        </nav>
    );
}
