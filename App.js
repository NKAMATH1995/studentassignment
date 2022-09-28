import { BrowserRouter, Switch, Route } from 'react-router-dom';
import NotFound from './components/NotFound';
import 'bootstrap/dist/css/bootstrap.min.css';

import StudentsList from './components/StudentsList';
import AddStudent from './components/AddStudent';

function App() {
  return (
    <BrowserRouter>
      <div>
        <div>
          <Route>
            <Route exact path="/" component={StudentsList} />
            <Route path="/add" component={AddStudent} />
            <Route path="/students/edit/:id" component={AddStudent} />
            <Route path="*" component={NotFound} />
          </Route>
        </div>
      </div>
    </BrowserRouter>
  );
}


export default App;
            
          