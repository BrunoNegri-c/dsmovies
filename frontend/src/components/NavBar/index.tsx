import {ReactComponent as GithubIcon} from 'Assent/Img/Github.svg';
import './styles.css';

function Navbar(){
    return(
        <header>
        <nav className="container">
          <div className="dsmovies-nav-content">
            <h1>DsMovies</h1>
            <a href="https://github.com/BrunoNegri-c">
                <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovies-contact-link">/devsuperior</p>
              </div></a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;